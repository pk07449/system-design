package com.pankaj.lld.behavioral.command.traditinal;

class EmailCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Sending Email");
    }
}
