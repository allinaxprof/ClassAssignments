#author: Allina X
#date: 2/22/25
#use: Have your html files for FOLLOWERS and FOLLOWING in the same folder before running

#Your FOLLOWERS
val1 = input("Input the name of your FOLLOWERS file including the .html: ")
theFile = open(val1, "r", encoding="utf-8")
myFile = theFile.read()
theFile.close()

#You're FOLLOWING
val2 = input("Input the name of your FOLLOWING file including the .html: ")
theFile = open(val2, "r", encoding="utf-8")
following = theFile.read()
theFile.close()

import re

#input: string containing raw html data
#process: find all instagram profile hrefs and extract the username from the URL
#output: a list of all usernames in that file
def returnUsernames(myFile):
    hrefs = re.findall(r'href="https://www\.instagram\.com/(?:_u/)?([^/"]+)/?"', myFile)
    return hrefs

#lists of followers and following
try:
    followers = returnUsernames(myFile)
    imFollower = returnUsernames(following)
except:
    print("File doesn't exist or folder configuration is wrong")

#prints usernames in <imFollower> that are not in <followers>
wantedData = list(filter(lambda x: not x in followers, imFollower))
print("Count: ", len(wantedData))
print(wantedData)