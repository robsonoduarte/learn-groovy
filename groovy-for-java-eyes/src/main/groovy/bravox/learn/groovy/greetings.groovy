package bravox.learn.groovy

// version groovy using for
for(i in 0..2) {print 'ho '}
println 'Merry Groovy!'

//version groovy using times method
3.times {print 'ho '}
println 'Merry Groovy!'


// some ways to iterate
p('0.upto(2) -> ')
0.upto(2){print "$it "} // the upto on java.lang.Integer - magic!! a literal number have a method :magic:

p('3.times -> ')
3.times {print "$it " } // when start at 0 we can use the times

p('0.step(10, 2) -> ')
0.step(10, 2) {print "$it "}

void p(String text){
    println()
    print(text)
}