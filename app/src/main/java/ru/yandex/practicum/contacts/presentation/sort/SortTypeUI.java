package ru.yandex.practicum.contacts.presentation.sort;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;
import ru.yandex.practicum.contacts.presentation.sort.model.SortType;

// Шаг 2. Реализация интерфейса
//public class SortTypeUI
  public class SortTypeUI implements ListDiffInterface<SortTypeUI>
{

    private final SortType sortType;
    private final boolean selected;

    public SortTypeUI(@NonNull SortType sortType, boolean selected) {
        this.sortType = sortType;
        this.selected = selected;
    }

    public SortType getSortType() {
        return sortType;
    }

    public boolean isSelected() {
        return selected;
    }

    // Шаг 2. Реализация интерфейса  SortTypeUI и theSameAs()
    @Override
    public boolean theSameAs(SortTypeUI t_same)
    {
        return this.getSortType() == t_same.getSortType();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SortTypeUI that = (SortTypeUI) o;

        if (selected != that.selected) return false;
        return sortType == that.sortType;
    }

    @Override
    public int hashCode() {
        int result = sortType.hashCode();
        result = 31 * result + (selected ? 1 : 0);
        return result;
    }
} // public class SortTypeUI
