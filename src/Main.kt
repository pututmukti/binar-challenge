import java.util.Scanner;
class Main  {
	companion object : Suit{
		@JvmStatic
		fun main(args:Array<String>){
			val input = Scanner(System.`in`)
			println("==========================")
			println("GAME SUIT TERMINAL VERSION")
			println("==========================")
			println("1. Masukkan pemain 1:")
		    val pemain1 = input.nextLine()
			println("2. Masukkan pemain 2:")
		    val pemain2 = input.nextLine()
			val pemain = Pemain(pemain1,pemain2)
			val suitResult = SuitResultBuilder()
				.addSuitResult(SuitResult("gunting","kertas"))
				.addSuitResult(SuitResult("batu","gunting"))
				.addSuitResult(SuitResult("kertas","batu"))
			val controller = SuitController(this).suitProcess(pemain,suitResult.suitResultBase)
		}
		
		override fun result(result:String){
			println("Hasil : ")
			println(result)
		}
		
	}
	
}