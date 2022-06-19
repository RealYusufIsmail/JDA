/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.internal.entities;

import net.dv8tion.jda.api.entities.ActionMetadata;
import net.dv8tion.jda.api.entities.TextChannel;

import javax.annotation.Nonnull;
import java.time.Duration;
import java.util.Objects;

public class ActionMetadataImpl implements ActionMetadata {

    private TextChannel channel;
    private Duration duration;

    @Override
    public TextChannel getChannel() {
        return channel;
    }

    @Override
    public @Nonnull Duration getDuration() {
        return duration;
    }

    public ActionMetadataImpl setChannel(TextChannel channel) {
        this.channel = channel;
        return this;
    }

    public ActionMetadataImpl setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionMetadataImpl that = (ActionMetadataImpl) o;
        return duration == that.duration && Objects.equals(channel, that.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, duration);
    }

    @Override
    public String toString() {
        return "ActionMetadata(channel=" + channel + ", duration=" + duration + ")";
    }
}
