fun main() {
val cars = arrayOf(10, 8, 0, 15, -5, 20, 25) // array dari gc
for (x in cars) {
//mengecek jika array ini 0
 if (x == 0){
    continue
 }
//mengecek jika array ini negatif
 if (x<0){
    break
 }
  println("Angka: "+x)
}
}
