const express = require("express");
const server = express();
const { PORT } = require("./config");
const { HomeRoutes, QuotesRoutes } = require("./routes");
const { NotFoundMidleware } = require("./middlewares");

server.use(express.static("./public"));
server.use(express.json());

server.use("/", HomeRoutes);
server.use("/", QuotesRoutes);

server.use(NotFoundMidleware);

server.listen(PORT, () => {
    console.log(`Application running on PORT ${PORT}`);
});