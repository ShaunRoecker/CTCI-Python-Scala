
# 

def string_rotation(s1: str, s2: str)-> bool:
    if len(s1) == len(s2) != 0:
        return s2 in s1 * 2
    return False

def string_rotation2(s1: str, s2: str)-> bool:
    char_set = set(s1 + s1)
    if len(s1) == len(s2) and s2 in char_set:
        return True
    return False
    


print(string_rotation("waterbottle", "ttlewaterbo")) # True
print(string_rotation2("waterbottle", "ttlewaterbo")) # True
