# language: en

Feature: Check voter

Scenario: checks if the voter has already voted
	Given the nif of the voter
	When the system receives the data
	Then it shows if this person has already voted or not
