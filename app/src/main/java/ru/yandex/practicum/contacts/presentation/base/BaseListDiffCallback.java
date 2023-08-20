package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

// Шаг 3. Дженерик-класс
public class BaseListDiffCallback<T_base extends ListDiffInterface<T_base>> extends DiffUtil.ItemCallback<T_base>

{
    @Override
    public boolean areItemsTheSame (@NonNull T_base oldItem, @NonNull T_base newItem)
    {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame (@NonNull T_base oldItem, @NonNull T_base newItem)
    {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull T_base oldItem, @NonNull T_base newItem) {
        return newItem;
    }
} // public class BaseListDiffCallback
