package me.pol.bot.events;

import me.pol.bot.main.info;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MuteCommand extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(info.PREFIX + "mute")){
            if(args.length <= 1){
                sendErrorMessage(event.getChannel(), event.getMember());
            }
            else{
                Member target = event.getMessage().getMentionedMembers().get(0);
            }
        }else{

        }
    }

    public void sendErrorMessage(TextChannel channel, Member member){

    }
}
