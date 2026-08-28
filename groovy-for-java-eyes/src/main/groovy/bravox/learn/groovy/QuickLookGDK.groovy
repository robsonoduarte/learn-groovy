package bravox.learn.groovy

// Groovy Java (21) Code Style
class ExecuteProcess {
    void main() {
        new ProcessBuilder("ls", "-al").start()
                .inputReader()
                .lines()
                .forEach(System.out::println);
    }
}
