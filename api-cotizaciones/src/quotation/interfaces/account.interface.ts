export interface Account {
    system: string;
    state: 'pending' | 'error' | 'in-process' | 'done';
    stateDetail: string; 
}
