package info.wallyson.banking.application.handler

import info.wallyson.banking.application.command.P2PCommand

class P2PTransferHandler: ICommandHandler<P2PCommand> {

    override fun execute(command: P2PCommand) {

        // create p2p on database, or we could get it from a previous step

        // take money from debit account

        // update p2p status to partially completed

        // put money on credit account

        // update p2p to completed...

    }


}


