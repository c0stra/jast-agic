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

package foundation.rpg.dfa;


import foundation.rpg.gnfa.State;

import java.util.*;

public class StateSet {

    private final Set<State> states = new LinkedHashSet<>();
    private final Map<Object, StateSet> charTransitions = new LinkedHashMap<>();
    private final Map<Object, StateSet> groupTransitions = new LinkedHashMap<>();
    private final Set<Object> inversions = new LinkedHashSet<>();
    private StateSet defaultState;

    public void add(State state) {
        states.add(state);
    }

    public void addAll(StateSet state) {
        states.addAll(state.states);
    }

    public Set<State> getStates() {
        return states;
    }

    public StateSet getDefaultState() {
        return defaultState;
    }

    public void setDefaultState(StateSet defaultState) {
        this.defaultState = defaultState;
    }

    public void addFailOn(Object c) {
        inversions.add(c);
    }

    public void setCharTransition(Object a, StateSet set) {
        this.charTransitions.put(a, set);
    }

    public void setGroupTransition(Object a, StateSet set) {
        this.groupTransitions.put(a, set);
    }

    public Map<Object, StateSet> getCharTransitions() {
        return charTransitions;
    }

    public Map<Object, StateSet> getGroupTransitions() {
        return groupTransitions;
    }

    public Set<Object> getInversions() {
        return inversions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateSet stateSet = (StateSet) o;
        return states.equals(stateSet.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(states);
    }
}