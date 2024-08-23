"""
Allina Xiao
012
12/7/23
Assignment 11 - Problem 3
"""

class Smartphone:

    # construct a new Smartphone
    def __init__(self, capacity, name):
        self.capacity = capacity
        self.name = name
        self.apps = {}

        print("Smartphone created")
        Smartphone.report(self)

    # add a new app to the smartphone given an appname
    #(string) and an appsize (integer)
    def add_app(self, appname, appsize):
        if appname in self.apps.keys():
            print("App already installed")
        elif (Smartphone.spaceUsed(self) + appsize) > self.capacity:
            print("Cannot install app, no available \
space")
        else:
            self.apps.update({appname:appsize})
            

    # removes an app from the phone based on appname
    #(string)
    def remove_app(self, appname):
        if appname in self.apps.keys():
            del self.apps[appname]
            print("App removed:", appname)
        else:
            print("App not installed")

    # checks to see if an app is installed based on
    #appname (string)
    # returns True if the app is installed, False if
    #it is not
    def has_app(self, appname):
        if appname in self.apps.keys():
            return True
        else:
            return False

    # returns the current space available on the phone
    #(integer)
    def get_available_space(self):
        spaceUsed = 0
        for app in self.apps.keys():
            spaceUsed += self.apps[app]
        return (self.capacity - spaceUsed)

    #returns the space used
    def spaceUsed(self):
        spaceUsed = 0
        for app in self.apps.keys():
            spaceUsed += self.apps[app]
        return spaceUsed

    # prints a detailed report that describes the following:
    # Name of phone
    # Capacity of phone
    # Available space
    # # of apps installed
    # a listing of all apps installed, in alphabetical
    #order, with their sizes
    # this method returns nothing and simply prints
    #the desired output to the user
    def report(self):
        print("Name:", self.name)
        print("Capacity:", Smartphone.spaceUsed(self), "out of",\
self.capacity, "GB")
        print("Available space:", Smartphone.get_available_space(self))
        print("Apps installed:", len(self.apps))

        for app in self.apps.keys():
            print("*", app, "is using", self.apps[app], "GB")

capacity = int(input("Size of your new smartphone (32, 64 or 128 GB): "))
name = input("Smartphone name: ")

newphone = Smartphone(capacity, name)
print()

while True:
    choice = input("(r)eport, (a)dd app, r(e)move app or (q)uit: ")
    if choice == 'q':
        print("Goodbye!")
        break
    elif choice == 'r':
        newphone.report()
    elif choice == 'a':
        appname = input("App name to add: ")
        appsize = int(input("App size in GB: "))
        newphone.add_app(appname, appsize)
    elif choice == 'e':
        appname = input("App name to remove: ")
        newphone.remove_app(appname)
    else:
        print("Not a valid option")
    print()









            
