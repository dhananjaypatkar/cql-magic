library AdultMajorDepressiveDisorderMDDSuicideRiskAssessment version '7.2.000'

using QDM version '5.3'

include MATGlobalCommonFunctions version '2.0.000' called Global

codesystem "SNOMEDCT:2017-09": 'urn:oid:2.16.840.1.113883.6.96' version 'urn:hl7:version:2017-09'

valueset "ONC Administrative Sex": 'urn:oid:2.16.840.1.113762.1.4.1'
valueset "Race": 'urn:oid:2.16.840.1.114222.4.11.836'
valueset "Ethnicity": 'urn:oid:2.16.840.1.114222.4.11.837'
valueset "Payer": 'urn:oid:2.16.840.1.114222.4.11.3591'
valueset "Emergency Department Visit": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1010'
valueset "Major Depressive Disorder-Active": 'urn:oid:2.16.840.1.113883.3.526.3.1491'
valueset "Office Visit": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1001'
valueset "Outpatient Consultation": 'urn:oid:2.16.840.1.113883.3.464.1003.101.12.1008'
valueset "Psych Visit - Diagnostic Evaluation": 'urn:oid:2.16.840.1.113883.3.526.3.1492'
valueset "Psych Visit - Psychotherapy": 'urn:oid:2.16.840.1.113883.3.526.3.1496'
valueset "Psychoanalysis": 'urn:oid:2.16.840.1.113883.3.526.3.1141'

code "Suicide risk assessment (procedure)": '225337009' from "SNOMEDCT:2017-09" display 'Suicide risk assessment (procedure)'

parameter "Measurement Period" Interval<DateTime>

context Patient

define "SDE Ethnicity":
	["Patient Characteristic Ethnicity": "Ethnicity"]

define "SDE Payer":
	["Patient Characteristic Payer": "Payer"]

define "SDE Race":
	["Patient Characteristic Race": "Race"]

define "SDE Sex":
	["Patient Characteristic Sex": "ONC Administrative Sex"]

define "Denominator":
	"Initial Population"

define "Numerator":
	"New or Recurrent Major Depressive Disorder Encounter" NewOrRecurrentMDDEncounter
		with ["Intervention, Performed": "Suicide risk assessment (procedure)"] SuicideRiskAssessment
			such that SuicideRiskAssessment.relevantPeriod during NewOrRecurrentMDDEncounter.relevantPeriod

define "Major Depressive Disorder Encounter":
	( ["Encounter, Performed": "Psych Visit - Diagnostic Evaluation"]
		union ["Encounter, Performed": "Emergency Department Visit"]
		union ["Encounter, Performed": "Office Visit"]
		union ["Encounter, Performed": "Outpatient Consultation"]
		union ["Encounter, Performed": "Psych Visit - Psychotherapy"]
		union ["Encounter, Performed": "Psychoanalysis"] ) ValidEncounter
		where exists ( ValidEncounter.diagnoses EncounterDiagnosis
				where EncounterDiagnosis in "Major Depressive Disorder-Active"
		)

define "Initial Population":
	"New or Recurrent Major Depressive Disorder Encounter" NewOrRecurrentMDDEncounter
		with ["Patient Characteristic Birthdate"] BirthDate
			such that Global."CalendarAgeInYearsAt"(BirthDate.birthDatetime, start of "Measurement Period")>= 17

define "New or Recurrent Major Depressive Disorder Encounter":
	"Major Depressive Disorder Encounter" NewOrRecurrentMDDEncounter
		without "Major Depressive Disorder Encounter" PriorMDDEpisodeEncounter
			such that PriorMDDEpisodeEncounter !~ NewOrRecurrentMDDEncounter
				and PriorMDDEpisodeEncounter.relevantPeriod ends 104 days or less before day of start of NewOrRecurrentMDDEncounter.relevantPeriod
		where NewOrRecurrentMDDEncounter.relevantPeriod during "Measurement Period"
