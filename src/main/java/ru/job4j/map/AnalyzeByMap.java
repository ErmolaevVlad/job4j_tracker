package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> avgScorePupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            avgScorePupil.add(new Label(pupil.name(), score / count));
        }
        return avgScorePupil;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        List<Label> avgScoreSubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), subject.score() + map.getOrDefault(subject.name(), 0));
            }
        }
        for (String key : map.keySet()) {
            avgScoreSubject.add(new Label(key, map.get(key) / pupils.size()));
        }
        return avgScoreSubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> scorePupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            scorePupil.add(new Label(pupil.name(), score));
        }
        scorePupil.sort(Comparator.naturalOrder());

        return scorePupil.get(scorePupil.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = new HashMap<>();
        List<Label> scoreSubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), subject.score() + map.getOrDefault(subject.name(), 0));
            }
        }
        for (String key : map.keySet()) {
            scoreSubject.add(new Label(key, map.get(key)));
        }
        scoreSubject.sort(Comparator.naturalOrder());
        return scoreSubject.get(scoreSubject.size() - 1);
    }
}