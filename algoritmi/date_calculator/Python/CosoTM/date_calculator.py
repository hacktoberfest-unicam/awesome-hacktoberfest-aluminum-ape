from datetime import datetime

date1 = input("Inserisci prima data 1 (yyyy/mm/dd h:m:s): ")
date2 = input("Inserisci prima data 2 (yyyy/mm/dd h:m:s): ")

d1 = datetime.strptime(date1, "%Y/%m/%d %H:%M:%S")
d2 = datetime.strptime(date2, "%Y/%m/%d %H:%M:%S")


print(f"Result: {d1-d2}");