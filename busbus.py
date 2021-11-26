name="Olubusolami" #aka Busbus
program_level="computer science_300"
likes=['food','ui/ux design','solving problems','colour blue','Jesus','action movies','chilling']
skills={'python':'intermediate','ds and algos':'omo','backend (django)':'need help!','ui/ux_design':'intermediate','digital art and illustration':'intermediate'}

print("You can call me "+name+"\n\nCurrently in "+program_level)

print("\nI like ",end=' ')

for i in range(len(likes)):
    if i==len(likes)-1:
        print("and "+likes[i]+".")
    elif i==len(likes)-2:
        print(likes[i]+" ", end=' ')
    else:
        print(likes[i]+", ", end=' ')

print("\nCheck out my skills and proficiency levels:")
print(skills)

print('\nJust exploring this tech thing. Byeeeeee!')