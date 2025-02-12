import axios from "axios";

export const api = axios.create({
  baseURL: "http://localhost:8080",
  headers: { "Content-Type": "application/json" },
  
});

export const addProduct = (data) => api.post("/product/add", data);