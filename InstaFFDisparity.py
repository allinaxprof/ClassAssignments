#author: Allina X
#date: 2/22/25
#use: Have your html files for FOLLOWERS and FOLLOWING in the same folder before running

#Your FOLLOWERS
val1 = input("Input the name of your FOLLOWERS file including the .html: ")
theFile = open(val1, "r")
myFile = theFile.read()
theFile.close()

#You're FOLLOWING
val2 = input("Input the name of your FOLLOWING file including the .html: ")
theFile = open(val2, "r")
following = theFile.read()
theFile.close()

#input: string containing raw html data
#process: split string at "</a>" and record chars backwards until reach ">"
#output: a list of all usernames in that file
def returnUsernames(myFile):
    cuteList = []
    lines = myFile.split("</a>")
    for i in lines:
        b = -1
        username = ""
        while i[b] != ">" and b < 30:
            username = i[b] + username
            b -= 1
        cuteList.append(username)
    
    return cuteList

#lists of followers and following
followers = returnUsernames(myFile)
imFollower = returnUsernames(following)

#prints usernames in <imFollower> that are not in <followers>
print(list(filter(lambda x: not x in followers, imFollower)))