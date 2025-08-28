
import { Injectable } from '@angular/core';

/**
 * API wrapper.
 * normally use HttpClient for base URLs.
 */
@Injectable({ providedIn: 'root' })
export class ApiService {
  baseUrl = '/api/v1';

  get(path: string, params?: Record<string, any>) {return Promise.resolve({}); }
  post(path: string, body: any) { return Promise.resolve({}); }
  put(path: string, body: any) { return Promise.resolve({}); }
  delete(path: string) { return Promise.resolve({}); }
}
