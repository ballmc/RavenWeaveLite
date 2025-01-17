package me.pianopenguin471.events.impl;

import me.pianopenguin471.events.ext.EventDirection;
import me.pianopenguin471.events.ext.IEventDirection;
import net.minecraft.network.Packet;
import net.weavemc.loader.api.event.CancellableEvent;

public class PacketEvent extends CancellableEvent implements IEventDirection {

    private Packet<?> packet;
    private final EventDirection direction;

    public PacketEvent(Packet<?> packet, EventDirection direction) {
        this.packet = packet;
        this.direction = direction;
    }

    public <T extends Packet<?>> T getPacket() {
        return (T) this.packet;
    }

    public <T extends Packet<?>> void setPacket(T newPacket) {
        this.packet = newPacket;
    }

    @Override
    public EventDirection getDirection() {
        return direction;
    }

}