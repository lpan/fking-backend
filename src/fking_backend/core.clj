(ns fking-backend.core
  (require [ring.adapter.jetty :as j]
           [fking-backend.routes :refer [handler]]))

(defn -main
  []
  (j/run-jetty handler {:port 3000}))
