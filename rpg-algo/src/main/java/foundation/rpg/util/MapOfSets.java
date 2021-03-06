/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, Ondrej Fischer
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package foundation.rpg.util;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static java.util.Collections.emptySet;

public final class MapOfSets<K, V> {

    private final Map<K, Set<V>> map = new LinkedHashMap<>();

    public Set<V> get(K key) {
        return getOrDefault(key, emptySet());
    }

    public Set<V> getOrDefault(K key, Set<V> defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    public boolean add(K key, V value) {
        return map.computeIfAbsent(key, k -> new LinkedHashSet<>()).add(value);
    }

    public boolean add(K key, Collection<V> value) {
        return map.computeIfAbsent(key, k -> new LinkedHashSet<>()).addAll(value);
    }
    public void forEach(BiConsumer<? super K, ? super Set<V>> consumer) {
        map.forEach(consumer);
    }

    public Set<K> keys() {
        return map.keySet();
    }

    public Set<V> computeIfAbsent(K key, Function<K, Set<V>> function) {
        return map.computeIfAbsent(key, function);
    }

}
