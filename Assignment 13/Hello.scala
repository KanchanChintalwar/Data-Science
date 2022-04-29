object Hello{
	def main(args: Array[String]) = {
		println("Hello, World");
		println("This is My 13th Assignment which is based on Scala.");
		println("This language is quite similar to Java but there are some changes.");
		var z = new Array[Int](3)
		z(0) = 3;
		z(1) = 4;
		z(2) = 9;
		var sum = 0;
		for(i <- z){
			sum += i;
		}
		println("Addition is "+sum);
	}
}
