import time
import datetime

localtime = time.asctime( time.localtime(time.time()) )
print ("Waktu lokal saat ini :", localtime)

tanggal_saat_ini = datetime.date.today()
print(tanggal_saat_ini) # tanggal pada hari ini akan ditampilkan di layar

saat_ini = datetime.datetime.now()
print(saat_ini) # tanggal saat ini akan ditampilkan di layar

a = time.localtime()
hr = a.tm_hour
mn = a.tm_min
print("{:d}:{:d}".format(hr,mn))