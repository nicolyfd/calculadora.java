print("This program registers ads and claculates their analytics")
# lists
adName = []
client = []
start = []
end = []
investment = []

ans = "y"

while ans == "y":
    name = input("please enter your ad name:")
    adName.append(name)

    name = input("please enter your client name:")
    client.append(name)

    name = input("please enter your start date in the following format (ddmmyyyy):")
    start.append(name)

    name = input("please enter your end date in the following format (ddmmyyyy):")
    end.append(name)

    name = input("please enter daily investment: $")
    investment.append(name)
    
    ans = input("If you would like to continue press 'y' if not press 'n':")
    if (ans == "n"):
        break
    
print("Here are all the clients by row") 

for i in range(len(adName)):
    print(adName[i])
for x in range(len(client)):
    print(client[x])
for i in range(len(start)):
    print(start[i])
for i in range(len(end)):
    print(end[i])
for i in range(len(investment)):
    print(investment[i]) 
