package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < evenElements.size(); evenElements.poll()) {
            stringBuilder.append(evenElements.poll());
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        while (descendingElements.size() > 0) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
