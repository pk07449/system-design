package com.pankaj.lld.behavioral.command.traditinal;

class Invoker {

    public void run(Command command) {
        command.execute();
    }
}
