package bravox.learn.groovy

def openFile(fileName) { // not need handler the FileNotFoundException
    new FileInputStream(fileName)
}

try {
   openFile("noFile") // the decision to handler is of caller
} catch (ex) { // we can omit the exception type if we call handler all
    println "Error -> " + ex
}


