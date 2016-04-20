# language: en

Feature: A voter logs in the system with its user and password and if everything is correct, he can vote.

Scenario: incorrect password
	Given the nif suppose it exists
	When the voter introduces a wrong password
	Then the program shows an error
	
Scenario: invalid nif
	Given the nif it does not exist
	When the voter introduces the nif and password
	Then the program shows an error
	
Scenario: not e-voter
	Given the nif of a voter who is not registered as evoter
	When the voter tries to access the system
	Then the program shows an error 