package bravox.learn.groovy

// using the groovy
for(i in 0..2) {print 'ho '}
println 'Merry Groovy!'

// other ways to iterate
0.upto(2){print "$it "} // the upto on java.lang.Integer - magic!! a literal number have a method :magic:

println()

// when start at 0 we can use the times
3.times {print "$it " }
