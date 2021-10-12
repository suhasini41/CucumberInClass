Feature: Check if the given Strings are palindrome
Scenario Outline: String palindrome verification
Given a <word>
When I reverse the String
Then I verfiy if they are equal to the <result>

Examples:
|word|result|
|"madam"|"palindrome"|
|"phone"|"not palindrome"|
|"racecar"|"palindrome"|
|"book"|"not palindrome"|
