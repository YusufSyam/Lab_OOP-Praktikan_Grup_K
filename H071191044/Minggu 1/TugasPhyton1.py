buku = []

def insertData():
    tambahBuku= input("Judul buku yang akan ditambahkan : ")
    buku.append(tambahBuku)

def editData():
    showData()
    indeksSunting= input("Masukkan indeks buku yang ingin disunting : ")

    if (int(indeksSunting)-1>=len(buku)): print ("Input salah")
    else :
        print ("Judul lama : "+buku[int(indeksSunting)-1])
        suntingBuku= input("Judul baru : ")
        buku[int(indeksSunting)-1]= suntingBuku

def deleteData():
    indeksHapus = input("Masukkan indeks buku yang ingin dihapus : ")

    if (int(indeksHapus)-1>=len(buku)): print("Input salah")
    else:
        print ("Menghapus {}...".format(buku[int(indeksHapus)-1]))
        del buku[int(indeksHapus)-1]

def showData():
    if (len(buku)==0): print ("--Kosong--")
    else :
        for i in range(len(buku)):
            print ("{}. {}".format((int(i+1)), buku[i]))

print ("[]-[][]-[]--   Perpustakaan   --[]-[][]-[]")

while(True):
    print ("[][]- Pilih opsi untuk perpustakaanmu -[][]\n1. Beli buku\n2. Sunting judul buku\n3. Buang buku\n4. Periksa semua buku\n5. Tutup perpustakaan")
    b= input()
    a= int(b)

    if(a==1): insertData()
    elif (a==2): editData()
    elif (a==3): deleteData()
    elif (a==4):
        print("[][]- Daftar buku  di perpustakaan mu -[][]")
        showData()
    elif (a==5): break
    else : print ("Input salah")