fun main() {
    var harga = 0
     //mengecek jika harga negatif
    if(harga>0){
// mengecek jika mahal
        if(harga > 500000){
            print("Mahal")
// mengecek jika sedang
        }else if(harga > 100000){
            print("Sedang")
// mengecek jika murah
        }else if(harga <= 100000){
            print("Murah")
        }
    }else{
        print("Harga tidak valid.")
    }
}
