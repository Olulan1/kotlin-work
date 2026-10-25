// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    /*with(System.out) {
    	
    }*/
    val filePath = Path("test.txt")
    val content = "Jugemu Jugemu Gokō-no Surikire Kaijarisuigyo-no \n Suigyōmatsu Unraimatsu Fūraimatsu Kūnerutokoro-ni \n Sumutokoro Yaburakōji-no Burakōji Paipopaipo \n Paipo-no Shūringan Shūringan-no Gūrindai \n Gūrindai-no Ponpokopii-no Ponpokonā-no Chōkyūmei-no Chōsuke"
    with(filePath) {
    	writeText(content)
    	appendText("\n I bit my tongue!")
    	
    }
    val output = filePath.readText()
    with (System.out) {
    	printf(output)
    }
    
    
}
