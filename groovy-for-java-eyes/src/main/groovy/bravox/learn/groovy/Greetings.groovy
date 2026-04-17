
package bravox.learn.groovy


// Java Code
class GreetingsJavaCode {

    static void main(String[] args) {
        for (int i = 0; i < 3; i++ ){
            System.out.print("ho ");
        }
        System.out.println("Merry Groovy!");
    }
}

for(i in 0..2) {print 'ho '}

println 'Merry Groovy'

// other ways to iterate
0.upto(2){print it} // the upto on java.lang.Integer - magic!! a literal number have a method :magic: