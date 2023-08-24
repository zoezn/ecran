// pages/api/proxy.js
export default async (req, res) => {
	try {
		const apiUrl = `http://52.87.235.254:8080/api/v1/movies/filter${req.url}`;
		const apiResponse = await fetch(apiUrl);
		const apiData = await apiResponse.json();
		res.status(apiResponse.status).json(apiData);
	} catch (error) {
		console.error("Error fetching data from API:", error);
		res.status(500).json({ error: "An error occurred while fetching data from API" });
	}
};
