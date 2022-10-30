#ifndef linked_list_h
#define linked_list_h

struct node_t;

typedef struct linked_list_t{
    struct node_t *head;
    struct node_t *tail;
}linked_list;

void init_list(linked_list *list);
void add_to_tail(void *element, linked_list *list);
void add_to_head(void *element, linked_list *list);

void linked_list_to_array(size_t base_type, linked_list list, void*** array);
#endif
