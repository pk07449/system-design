package com.pankaj.lld.behavioral.command.traditinal;

class SaveCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Saving Order");
    }
}
