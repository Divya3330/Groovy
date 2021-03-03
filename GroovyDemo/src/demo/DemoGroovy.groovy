package demo

class DemoGroovy {

    static void main(args) {
        // TODO Auto-generated method stub
        
        def urlContents="http://aba.myspecies.info/".toURL().getText()
        
        urlContents.eachLine{
            println it
        }
        
    }
}