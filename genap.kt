fun main() {
var awal = 1 //ini var untuk awal loop
var akhir = 20 //ini var untuk awal akhir loop
var no = 0 //untuk for
var no1 = 0 //untuk while
var no2 = 0 //untuk do while
  for(x in 0 until akhir){
   //mengecek jika genap
     if(x % 2 == 0){
         no++
     }
  }

  while(awal<akhir){
      Awal++
   //mengecek jika genap
      if(awal % 2 == 0){
         no1++
     }
  }

//merestart awal
  awal=1
   do {
      Awal++
   //mengecek jika genap
      if(awal % 2 == 0){
         no2++
     }
  }while(awal<akhir)
  println("untuk for: " + no)
  println("untuk while: " + no1)
  println("untuk do-while: " + no2)
}
