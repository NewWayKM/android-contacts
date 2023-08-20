package ru.yandex.practicum.contacts.presentation.base;
/* Шаг 1. Интерфейс


*/
//public interface ListDiffInterface <T>
public interface ListDiffInterface <T_item>
{
   //boolean theSameAs (T t_Same);
   boolean theSameAs (T_item t_same);
   boolean equals(Object t_Equals);
}
