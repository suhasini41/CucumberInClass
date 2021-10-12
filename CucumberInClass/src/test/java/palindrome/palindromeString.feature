Feature: Check if the given Strings are palindrome
Scenario Outline: String palindrome verification
Given a <word>
When I reverse the String
Then I verfiy if they are palindrome or not

Examples:
|word|
|"madam"|
|"phone"|
|"racecar"|
|"book"|
