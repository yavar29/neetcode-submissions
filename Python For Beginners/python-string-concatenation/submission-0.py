def concatenate(s1: str, s2: str) -> str:
    combined = s1 + s2
    if len(combined) > 10:
        return "Too long!"
    return combined




# do not modify below this line
print(concatenate("He", "llo"))
print(concatenate("Hello ", "world!"))
print(concatenate("Length", "of10"))
