# ClassAssignments
A collection of small programs, highlighting my coding proficiency.

## Instagram Followers/Following Disparity - Python
Returns a list of the usernames you are following that are not following you back (Followers/Following Disparity).  

1. Download your follower and following data from Instagram as HTML files; I would suggest downloading data from "all time" when prompted ([click here](https://help.instagram.com/181231772500920) for help)
2. Download InstaFFDisparity
3. Make sure the InstaFFDisparity file is in the same folder as your HTML files
4. Run InstaFFDisparity
5. Enter the names of the HTML files when prompted (might be helpful to put the names of the files somewhere to copy and paste)  

Output will be a list of usernames printed to the terminal.

## Huffman Encoder - Java Data Structures
From Wikipedia: "a Huffman code is a particular type of optimal prefix code that is commonly used for lossless data compression. The output can be viewed as a variable-length code table for encoding a source symbol (such as a character in a file). The algorithm derives this table from the estimated probability or frequency of occurrence (weight) for each possible value of the source symbol."

Using a Binary Heap, this codes and decodes txt files into Huffman codes

## Planet Currency - Java OOP practice
- Currency = abstract parent class
- Exchangeable = interface
- Mars = extends Currency
- Saturn = extends Currency
- Jupiter = extends Currency
- Main = calling .exchange(planet, amount) adds the amount to the planet in question, subtracting the amount + service fee from the original planet

## AppStoreSimulator - Python OOP practice
Smartphone = class
 - instance variables = storage capacity, name, dictionary of apps {appName : appSize}
 - add_app = adds an app and its storage as long as the appName does not exist in the dictionary and the storage space is available
 - remove_app = removes an app based on appName as long as it exists in the dictionary
 - has_app = returns true if appName is in dictionary
 - get_available_space = returns storage capacity remaining
 - spaceUsed = returns storage capacity used
 - report = prints a report with Name of phone, Capacity of phone, Available space, # of apps installed, a listing of all apps installed in alphabetical order, with their sizes

Runs
 - a main program to report, add an app, remove an app, or quit the program

## GumballMachine - Python using random module

## RectangleID - Python basic operators practice
