"""
Allina Xiao
012
12/7/23
Assignment 11 - Problem 2
"""

#class
class Gumball_Machine:
    
    #constructor holds capacity number and money = 0
    #totalgum is at <num> capacity and each <num> is either red, green, or blue, set randomly
    def __init__(self, num):
        self.money = 0
        self.totalgum = []
        
        for gum in range(num):
            import random
            color = random.randint(1,3)
            if color == 1:
                self.totalgum += ['red']
            elif color == 2:
                self.totalgum += ['green']
            else:
                self.totalgum += ['blue']
                
        #announce construction
        print("Gumball Machine created with", num, "random gumballs")
        print()
        
    #accept no arguments and simply report out the current status of the gumball machine
    def report(self):
        print("Gumball Machine Report: ")
        print("* Gumballs in machine: ", len(self.totalgum))        
        print("* Money in machine: $" + format(self.money, '.2f'))
        print()

    #if coin = 0.25, remove 1 gumball and remove from list
    #report it
    #increase money amount
    #if len(totalgum) == 0, reject coin
    def dispense(self, coin):
        if len(self.totalgum) == 0:
            print("Machine is empty, no gumball will be \
dispensed")
        else:
            if coin == 0.25:
                color = self.totalgum[-1]
                del self.totalgum[-1]
                print("Accepting 0.25; Dispensing a", color,\
"gumball")
                self.money += 0.25
            else:
                print("Invalid coin, no gumball will be \
dispensed")
        print()

    #give gumball a color, count num in totalgum and print
    def count_gumballs_by_type(self, color):
        num = self.totalgum.count(color)
        print("There are", str(num), "of type", color,\
"in the machine")
        print()


machine = Gumball_Machine(5)
machine.report()

machine.count_gumballs_by_type("red")
machine.count_gumballs_by_type("green")
machine.count_gumballs_by_type("blue")

machine.dispense(0.10)
machine.dispense(0.50)
machine.dispense(0.01)

machine.report()

machine.count_gumballs_by_type("red")
machine.count_gumballs_by_type("green")
machine.count_gumballs_by_type("blue")

machine.dispense(0.25)
machine.dispense(0.25)
machine.dispense(0.25)

machine.report()

machine.count_gumballs_by_type("red")
machine.count_gumballs_by_type("green")
machine.count_gumballs_by_type("blue")

machine.dispense(0.25)
machine.dispense(0.25)
machine.dispense(0.25)

machine.report()

machine.count_gumballs_by_type("red")
machine.count_gumballs_by_type("green")
machine.count_gumballs_by_type("blue")









        
