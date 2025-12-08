package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PikaiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodymiddlefront;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Leftantenna;
	private final ModelPart Rightantenna;
	private final ModelPart Backslope1;
	private final ModelPart Rightfrond1;
	private final ModelPart Leftfrond1;
	private final ModelPart Rightfrond2;
	private final ModelPart Leftfrond2;
	private final ModelPart Rightfrond3;
	private final ModelPart Leftfrond3;
	private final ModelPart Rightfrond4;
	private final ModelPart Leftfrond4;
	private final ModelPart Rightfrond5;
	private final ModelPart Leftfrond5;
	private final ModelPart Rightfrond6;
	private final ModelPart Leftfrond6;
	private final ModelPart Rightfrond7;
	private final ModelPart Rightfrond10;
	private final ModelPart Rightfrond8;
	private final ModelPart Leftfrond8;
	private final ModelPart Rightfrond9;
	private final ModelPart Leftfrond9;
	private final ModelPart Backslope2;
	private final ModelPart Bodymiddleback;
	private final ModelPart Bodyback;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailend;
	private final ModelPart Tailslope2;
	private final ModelPart Fin5;
	private final ModelPart Tailslope1;
	private final ModelPart Fin4;
	private final ModelPart Fin3;
	private final ModelPart Fin2;
	private final ModelPart Fin1;
	private final ModelPart Backslope3;

	public PikaiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Bodymiddle = this.root.getChild("Bodymiddle");
		this.Bodymiddlefront = this.Bodymiddle.getChild("Bodymiddlefront");
		this.Bodyfront = this.Bodymiddlefront.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Leftantenna = this.Head.getChild("Leftantenna");
		this.Rightantenna = this.Head.getChild("Rightantenna");
		this.Backslope1 = this.Bodyfront.getChild("Backslope1");
		this.Rightfrond1 = this.Bodyfront.getChild("Rightfrond1");
		this.Leftfrond1 = this.Bodyfront.getChild("Leftfrond1");
		this.Rightfrond2 = this.Bodyfront.getChild("Rightfrond2");
		this.Leftfrond2 = this.Bodyfront.getChild("Leftfrond2");
		this.Rightfrond3 = this.Bodyfront.getChild("Rightfrond3");
		this.Leftfrond3 = this.Bodyfront.getChild("Leftfrond3");
		this.Rightfrond4 = this.Bodyfront.getChild("Rightfrond4");
		this.Leftfrond4 = this.Bodyfront.getChild("Leftfrond4");
		this.Rightfrond5 = this.Bodyfront.getChild("Rightfrond5");
		this.Leftfrond5 = this.Bodyfront.getChild("Leftfrond5");
		this.Rightfrond6 = this.Bodyfront.getChild("Rightfrond6");
		this.Leftfrond6 = this.Bodyfront.getChild("Leftfrond6");
		this.Rightfrond7 = this.Bodyfront.getChild("Rightfrond7");
		this.Rightfrond10 = this.Bodyfront.getChild("Rightfrond10");
		this.Rightfrond8 = this.Bodyfront.getChild("Rightfrond8");
		this.Leftfrond8 = this.Bodyfront.getChild("Leftfrond8");
		this.Rightfrond9 = this.Bodyfront.getChild("Rightfrond9");
		this.Leftfrond9 = this.Bodyfront.getChild("Leftfrond9");
		this.Backslope2 = this.Bodymiddlefront.getChild("Backslope2");
		this.Bodymiddleback = this.Bodymiddle.getChild("Bodymiddleback");
		this.Bodyback = this.Bodymiddleback.getChild("Bodyback");
		this.Tailbase = this.Bodyback.getChild("Tailbase");
		this.Tailmiddle = this.Tailbase.getChild("Tailmiddle");
		this.Tailend = this.Tailmiddle.getChild("Tailend");
		this.Tailslope2 = this.Tailend.getChild("Tailslope2");
		this.Fin5 = this.Tailend.getChild("Fin5");
		this.Tailslope1 = this.Tailmiddle.getChild("Tailslope1");
		this.Fin4 = this.Tailmiddle.getChild("Fin4");
		this.Fin3 = this.Tailbase.getChild("Fin3");
		this.Fin2 = this.Bodyback.getChild("Fin2");
		this.Fin1 = this.Bodymiddleback.getChild("Fin1");
		this.Backslope3 = this.Bodymiddle.getChild("Backslope3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(102, 0).addBox(-17.2963F, -0.5F, -47.1041F, 16.0F, 1.0F, 21.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.2963F, -0.5F, -29.1041F, 22.0F, 1.0F, 57.0F, new CubeDeformation(0.002F)), PartPose.offset(-2.7037F, 23.5F, 1.1041F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 59).addBox(0.0F, -0.5F, 0.0F, 26.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.2963F, 0.0F, 27.8959F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -0.5F, -31.0F, 16.0F, 1.0F, 31.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-17.2963F, 0.0F, 27.8959F, 0.0F, -0.1396F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 92).addBox(-16.8F, -0.5F, -15.9F, 16.0F, 1.0F, 28.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.7037F, 0.0F, -13.1041F, 0.0F, 0.1571F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(102, 23).addBox(-14.0F, -0.5F, -0.5F, 14.0F, 1.0F, 18.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(20.7037F, 0.0F, 28.3959F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 85).addBox(-15.0F, -1.0F, -29.0F, 15.0F, 1.0F, 29.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(20.7037F, 0.5F, -29.1041F, 0.0F, 0.8814F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7037F, 2.1F, -5.1041F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Bodymiddle = root.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(37, 17).addBox(-0.9F, -2.5F, -4.5F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.8903F, -12.4748F, -0.1309F, 0.0F, 1.5708F));

		PartDefinition Bodymiddlefront = Bodymiddle.addOrReplaceChild("Bodymiddlefront", CubeListBuilder.create().texOffs(0, 92).addBox(-0.7F, -1.0F, -8.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -4.0F, -0.1733F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddlefront.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(14, 0).addBox(-1.1F, 1.3F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 1.5F, -7.5F, 0.0F, -0.2182F, -1.5708F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(8, 0).addBox(-0.4998F, 1.7999F, -0.9886F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.5F, -5.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(26, 27).addBox(-0.9998F, 1.7999F, -0.9886F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

		PartDefinition Leftantenna = Head.addOrReplaceChild("Leftantenna", CubeListBuilder.create().texOffs(0, 4).addBox(-1.5067F, 1.1999F, -2.9834F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -0.8F, 0.0F, 0.4033F, 0.0F));

		PartDefinition Rightantenna = Head.addOrReplaceChild("Rightantenna", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4927F, 1.1999F, -2.9837F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.8F, 0.0F, -0.4033F, 0.0F));

		PartDefinition Backslope1 = Bodyfront.addOrReplaceChild("Backslope1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.7F, -0.4F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Rightfrond1 = Bodyfront.addOrReplaceChild("Rightfrond1", CubeListBuilder.create().texOffs(20, 26).addBox(0.0F, -0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -4.7F, 0.0F, 0.5164F, 0.0F));

		PartDefinition Leftfrond1 = Bodyfront.addOrReplaceChild("Leftfrond1", CubeListBuilder.create().texOffs(20, 9).addBox(-2.0F, -0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 1.2F, -4.7F, 0.0F, -0.5164F, 0.0F));

		PartDefinition Rightfrond2 = Bodyfront.addOrReplaceChild("Rightfrond2", CubeListBuilder.create().texOffs(13, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -4.2F, 0.0F, 0.2157F, 0.0F));

		PartDefinition Leftfrond2 = Bodyfront.addOrReplaceChild("Leftfrond2", CubeListBuilder.create().texOffs(20, 7).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.2F, -4.2F, 0.0F, -0.2157F, 0.0F));

		PartDefinition Rightfrond3 = Bodyfront.addOrReplaceChild("Rightfrond3", CubeListBuilder.create().texOffs(26, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -3.7F, -0.1274F, 0.0637F, 0.0F));

		PartDefinition Leftfrond3 = Bodyfront.addOrReplaceChild("Leftfrond3", CubeListBuilder.create().texOffs(14, 10).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.2F, -3.7F, -0.1287F, 0.1527F, -0.0278F));

		PartDefinition Rightfrond4 = Bodyfront.addOrReplaceChild("Rightfrond4", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -3.2F, -0.1319F, -0.2596F, 0.034F));

		PartDefinition Leftfrond4 = Bodyfront.addOrReplaceChild("Leftfrond4", CubeListBuilder.create().texOffs(14, 8).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.2F, -3.2F, -0.1294F, -0.1731F, 0.0224F));

		PartDefinition Rightfrond5 = Bodyfront.addOrReplaceChild("Rightfrond5", CubeListBuilder.create().texOffs(24, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -2.7F, -0.0424F, 0.0F, 0.0F));

		PartDefinition Leftfrond5 = Bodyfront.addOrReplaceChild("Leftfrond5", CubeListBuilder.create().texOffs(14, 6).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.2F, -2.7F, -0.0431F, 0.1744F, -0.0075F));

		PartDefinition Rightfrond6 = Bodyfront.addOrReplaceChild("Rightfrond6", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -2.2F, -0.0451F, -0.3476F, 0.0136F));

		PartDefinition Leftfrond6 = Bodyfront.addOrReplaceChild("Leftfrond6", CubeListBuilder.create().texOffs(6, 11).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.2F, -2.2F, -0.0444F, 0.304F, -0.0115F));

		PartDefinition Rightfrond7 = Bodyfront.addOrReplaceChild("Rightfrond7", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -1.7F, -0.0476F, -0.4771F, 0.0183F));

		PartDefinition Rightfrond10 = Bodyfront.addOrReplaceChild("Rightfrond10", CubeListBuilder.create().texOffs(0, 10).addBox(-1.8189F, 0.0062F, -0.6463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2152F, 1.2F, -1.4F, -0.0423F, 0.046F, -0.0055F));

		PartDefinition Rightfrond8 = Bodyfront.addOrReplaceChild("Rightfrond8", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -1.2F, -0.0666F, -0.8893F, 0.0455F));

		PartDefinition Leftfrond8 = Bodyfront.addOrReplaceChild("Leftfrond8", CubeListBuilder.create().texOffs(6, 9).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.2F, -1.2F, -0.0442F, 0.3229F, -0.0078F));

		PartDefinition Rightfrond9 = Bodyfront.addOrReplaceChild("Rightfrond9", CubeListBuilder.create().texOffs(20, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.2F, -0.7F, -0.0424F, -0.2122F, 0.0F));

		PartDefinition Leftfrond9 = Bodyfront.addOrReplaceChild("Leftfrond9", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.7F, -0.0504F, 0.6045F, -0.0197F));

		PartDefinition Backslope2 = Bodymiddlefront.addOrReplaceChild("Backslope2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.68F, -0.3F, 0.3449F, 0.0F, 0.0F));

		PartDefinition Backslope2_r1 = Backslope2.addOrReplaceChild("Backslope2_r1", CubeListBuilder.create().texOffs(61, 92).addBox(-0.05F, -1.6F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 2.0F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddleback = Bodymiddle.addOrReplaceChild("Bodymiddleback", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -3.5F, 0.0F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.0F, 4.0F, 0.1489F, 0.0F, 0.0F));

		PartDefinition Bodyback = Bodymiddleback.addOrReplaceChild("Bodyback", CubeListBuilder.create().texOffs(25, 26).addBox(-1.0F, -3.5F, 0.0F, 0.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0F, 9.5F, 0.1096F, 0.0F, 0.0F));

		PartDefinition Tailbase = Bodyback.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -3.5F, 0.0F, 0.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, 10.5F, 0.1532F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailbase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(0, 22).addBox(-0.9F, -2.0F, 0.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.3F, 12.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddle.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.9F, 11.5F, 0.1086F, 0.0F, 0.0F));

		PartDefinition Tailslope2 = Tailend.addOrReplaceChild("Tailslope2", CubeListBuilder.create().texOffs(26, 46).addBox(-1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -2.9F, 0.2F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Fin5 = Tailend.addOrReplaceChild("Fin5", CubeListBuilder.create().texOffs(0, 78).addBox(-1.03F, 0.0F, 0.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.1274F, 0.0F, 0.0F));

		PartDefinition Tailslope1 = Tailmiddle.addOrReplaceChild("Tailslope1", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, 0.0F, 0.0F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8F, 0.0F, -0.1485F, 0.0F, 0.0F));

		PartDefinition Fin4 = Tailmiddle.addOrReplaceChild("Fin4", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, 0.0F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition Fin3 = Tailbase.addOrReplaceChild("Fin3", CubeListBuilder.create().texOffs(14, 9).addBox(-1.0F, 0.0F, 0.0F, 0.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.5F, 0.0F));

		PartDefinition Fin2 = Bodyback.addOrReplaceChild("Fin2", CubeListBuilder.create().texOffs(64, 59).addBox(-0.9F, 0.0F, 0.0F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.5F, 0.0F));

		PartDefinition Fin1 = Bodymiddleback.addOrReplaceChild("Fin1", CubeListBuilder.create().texOffs(13, 41).addBox(-1.1F, -1.0F, 0.0F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Backslope3 = Bodymiddle.addOrReplaceChild("Backslope3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5F, 4.5F, 0.1114F, 0.0F, 0.0F));

		PartDefinition Backslope3_r1 = Backslope3.addOrReplaceChild("Backslope3_r1", CubeListBuilder.create().texOffs(12, 69).addBox(0.0F, -0.5F, -0.4F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5F, -8.6F, 0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 155);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}