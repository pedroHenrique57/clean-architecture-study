package Edu.Syne.application.entities;

import java.util.Optional;

public record clientBusinessRule(String name, Integer id__checking__account, Optional<Integer> id__savings__account) {
}
