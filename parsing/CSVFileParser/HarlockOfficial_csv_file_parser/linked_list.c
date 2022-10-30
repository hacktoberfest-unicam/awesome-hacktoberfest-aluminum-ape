#include <stdio.h>
#include <stdlib.h>
#include "linked_list.h"

struct node_t{
    void* val;
    struct node_t *previous;
    struct node_t *next;
};

void init_list(linked_list *list){
    (*list).head = NULL;
    (*list).tail = NULL;
}

void add_to_tail(void *element, linked_list *list){
    struct node_t new_elem = {
        element,
        (*list).tail,
        NULL
    };
    (*list).tail->next = &new_elem;
    (*list).tail = &new_elem;
    if((*list).head == NULL){
        (*list).head = (*list).tail;
    }
}

void add_to_head(void *element, linked_list *list){
    struct node_t new_elem = {
        element,
        NULL,
        (*list).head
    };
    (*list).head->previous = &new_elem;
    (*list).head = &new_elem;
    if((*list).tail == NULL){
        (*list).tail = (*list).head;
    }
}

void linked_list_to_array(size_t base_type, linked_list list, void*** array){
    long long element_count = 0;
    struct node_t *current_node = list.head;
    while(current_node != NULL){
        current_node = current_node->next;
        element_count += 1;
    }
    
    *array = calloc(element_count, base_type);
    current_node = list.head;
    for(int i = 0; i<element_count; ++i){
        *array[i] = current_node->val;
        current_node = current_node->next;
    }
}
